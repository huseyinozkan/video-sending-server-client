/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agprogramlama_videogonderim;

/**
 *
 * @author huseyinozkan
 */
public class ClientCommon {

    public static String Host;
    public static int PortNumber = 5555;
    public static byte[] sendData;
    public static byte[] receiveData = new byte[65508];

    public static int TamponSize = 1460;
    static String Path = null;
    static byte[] KaynakBytes = null;
    static byte[] TamponBytes = new byte[TamponSize];
    static int baslangic = 0;
    static int bitis = TamponBytes.length;
}
