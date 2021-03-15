/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agprogramlama_videogonderim;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import javax.swing.JFileChooser;

/**
 *
 * @author huseyinozkan
 */
public class Functions {
    
    public static void DialogChooser() throws IOException {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.showOpenDialog(fileChooser);
        File file = fileChooser.getSelectedFile();
        ClientCommon.Path = file.getAbsolutePath();
        ClientCommon.KaynakBytes = Files.readAllBytes(file.toPath());
    }
    
    public static String DialogChooserKopyalacakYol() throws IOException {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.showOpenDialog(fileChooser);
        File file = fileChooser.getSelectedFile();
        return file.getAbsolutePath();
    }

    public static boolean ConvertBytesToFile(byte[] bytes, String path) {
        try {
            ServerCommon.file = new File(path);
            OutputStream os = new FileOutputStream(ServerCommon.file);
            os.write(bytes);
            System.out.println("Successfully byte inserted");
            os.close();

            ServerCommon.bilgi += "Dosya Alındı\n";
            return true;
        } catch (Exception e) {
            System.out.println("Exception: " + e);
            ServerCommon.bilgi += "Hata: " + e.getMessage() + "\n";
            ServerCommon.bilgi += "Dosya Alınamadı\n";
            ServerCommon.bilgi += "Tekrar Deneyiniz\n\n";
            return false;
        }
    }

    public static void TamponBirlestir(byte[] TamponBytes) {
        try {
            System.arraycopy(TamponBytes, 0, ServerCommon.HedefBytes, ServerCommon.hedefBaslangic, ServerCommon.TamponSize);
            ServerCommon.hedefBaslangic = ServerCommon.hedefBaslangic + ServerCommon.TamponSize;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.arraycopy(TamponBytes, 0, ServerCommon.HedefBytes, ServerCommon.hedefBaslangic, ServerCommon.HedefBytes.length % ServerCommon.TamponSize);
        }
    }
    
    public static String DosyaAdiniAl(String Path) {
        String[] array = Path.split("/");
        String dosyaAdi = "";
        for (String array1 : array) {
            dosyaAdi = array1;
        }
        return dosyaAdi;
    }
}
