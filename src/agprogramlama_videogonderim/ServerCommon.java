/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agprogramlama_videogonderim;

import java.io.File;
import java.net.InetAddress;

/**
 *
 * @author huseyinozkan
 */
public class ServerCommon {

    public static String Path = "/home/huseyinozkan/Desktop/AgProgramlama/AgProgramlama_VideoGonderim/ServerGelen/";
    public static String gelenDosyaAdi;
    public static int PortNumber = 5555;
    public static byte[] receiveData = new byte[65508];
    public static byte[] sendData = new byte[1460]; //1 MSS 1460 byte
    public static InetAddress IPAddress; //gelen verilerin geldiği Ip adresi
    public static int port;

    public static int TamponSize = 1460;
    public static byte[] HedefBytes = null; // serverda ilk olarak size alınacak ve buraya eklenecek
    public static int hedefBaslangic = 0;
    public static File file;
    public static String bilgi;
}
