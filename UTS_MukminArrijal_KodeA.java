/*akun Nurul Khairani Siregar melakukan fork pada akun milik murial
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1tid.mukmin_arrijal;

/**
 *
 * @author 313-36 PC
 */
import javax.swing.JOptionPane;

public class UTS_MukminArrijal_KodeA {

    public static void main(String[] args) {
        int paket, janak = 0, uanak = 0, pax, harga = 0, hargaF = 0, hanak = 0, hanakB = 0;
        String fasilitas = null, npaket = null, anak;

        //PEMILIHAN PAKET WISATA
        paket = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Pilihan Paket Tour : \n "
                + "1. Amazing Turki Tour \n"
                + "2. Bangkok Pattaya Tour \n"
                + "3. Paket Wisata Derawan \n"
                + "4. Exotic Bali Package \n"
                + "5. Raja Ampat \n"
                + "6. South Korea Winter \n"
                + "7. Paket Tour 3 Negara \n"));

        //PAKET WISATA
        switch (paket) {
            case 1:
                npaket = "Amazing Turki Tour";
                fasilitas = "4D/3N \n SDF-City Tour-Bandara \n Hotel Bintang 5 \n Makan 2x Sehari \n Souvenir";
                hargaF = 17500000;
                break;
            case 2:
                npaket = "Bangkok Pattaya Tour";
                fasilitas = "3D/2N \n Tiket Bangkok-Jakarta \n Hotel Bintang 3 \n Makan 2x Sehari \n Souvenir";
                hargaF = 1620000;
                break;
            case 3:
                npaket = "Paket Wisata Derawan";
                fasilitas = "3D/2N \n Tiket Jakarta-Kalimantan \n Hotel Bintang 2 \n Makan 2x Sehari \n Souvenir";
                hargaF = 2075000;
                break;
            case 4:
                npaket = "Exotic Bali Package";
                fasilitas = "5D/4N \n Tiket Jakarta-Bali \n Hotel Bintang 4 \n Makan 2x Sehari \n Souvenir";
                hargaF = 1338000;
                break;
            case 5:
                npaket = "Raja Ampat";
                fasilitas = "4D/3N \n Tiket Jakarta-Papua \n Hotel Bintang 2 \n Makan 2x Sehari \n Souvenir";
                hargaF = 7800000;
                break;
            case 6:
                npaket = "South Korea Winter";
                fasilitas = "7D/6N \n Tiket Jakarta-Korea \n Hotel Bintang 2 \n Makan 2x Sehari \n Souvenir";
                hargaF = 11800000;
                break;
            case 7:
                npaket = "Tour 3 Negara";
                fasilitas = "5D/4N \n Tiket Jakarta-KL \n Hotel Bintang 2 \n Makan 2x Sehari \n Souvenir";
                hargaF = 5800000;
                break;
        }

        harga = hargaF;

        //INPUT JUMLAH VAX
        pax = Integer.parseInt(JOptionPane.showInputDialog("Berapa Pax Yang akan dibeli?"));

        //BONUS JIKA PELANGGAN LEBIH DARI 4 ORANG
        if (pax > 4) {
            harga = (int) (harga - (harga * 0.15));
        }

        //PERCABANGAN JIKA MEMBAWA ANAK
        anak = JOptionPane.showInputDialog("Apakah Anda Membawa Anak? (Ya/Tidak)");
        if (anak.equals("ya")) {
            janak = Integer.parseInt(JOptionPane.showInputDialog("Berapa Jumlah Anak Yang Ikut?"));

            for (int i = 1; i <= janak; i++) {
                //INPUTAN USIA ANAK SEUSAI PENGULANGAN JUMLAH ANAK
                uanak = Integer.parseInt(JOptionPane.showInputDialog("Berapa usia anak ke-" + i));
                
                //BONUS JIKA USIA ANAK DIBAWAH 10 TAHUN
                if (uanak < 10 && uanak >= 5) {
                    hanak += harga - (harga * 0.35);
                } //BONUS JIKA USIA ANAK DIBAWAH 5 TAHUN
                else if (uanak < 5) {
                    hanakB += (harga - (harga * 0.5));
                }
            }

        }

        //OUTPUT PROGRAM
        JOptionPane.showMessageDialog(null, "Terima kasih telah memesan. Informasi pesanan anda adalah sbb: \n"
                + "Nama Paket : " + npaket
                + "\nFasilitas : " + fasilitas + "\nHarga per pax : Rp." + hargaF + "\nJumlah Peserta :" + pax + "\nAnak-anak : " + janak + "\nTotal harga : Rp." + pax * harga);

    }
}
