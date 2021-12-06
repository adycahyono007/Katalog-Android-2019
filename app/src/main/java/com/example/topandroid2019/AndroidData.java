package com.example.topandroid2019;

import java.util.ArrayList;

public class AndroidData {
    public static String[][] data = new String[][]{
            {"Realme C2", "smartphone berlayar 6.1-inch dengan Gorilla Glass 3, ditenagai ColorOS 6 Lite, Android 9.0 (Pie), dan dilengkapi kamera 13MP + 2MP dengan kapasitas 80 fps slo-mo.","https://www.yatekno.com/wp-content/uploads/2019/03/Realme-C2-Yatekno.jpg"},
            {"OPPO A5s", "berbekal layar waterdrop HD+ 6.2-inch dengan baterai berkapasitas 4230 mAh dapat bertahan 17 jam pemakaian normal, 13,5 jam menonton video offline, fast charging 5V2A, fitur Game Space meningkatkan performa gaming.","https://d2pa5gi5n2e1an.cloudfront.net/global/images/product/mobilephones/OPPO_A5sa/OPPO_A5sa_L_1.jpg"},
            {"Samsung Galaxy A20", "dengan Infinity-V display Super AMOLED HD+ 6.4-inch dibenami Exynos 7884 dipadukan RAM 3GB, dual kamera belakang, baterai berkapasitas 4000 mAh.", "https://d2pa5gi5n2e1an.cloudfront.net/global/images/product/mobilephones/Samsung_Galaxy_A20/Samsung_Galaxy_A20_L_1.jpg"},
            {"Samsung Galaxy A10", "berlayar HD+ Infinity-V 6.2-inch dengan chipset Exynos 7884, kamera depan 5MP, kamera belakang 13MP, baterai berkapasitas 3400 mAh.", "https://d2pa5gi5n2e1an.cloudfront.net/global/images/product/mobilephones/samsung_galaxy_a10/samsung_galaxy_a10_L_1.jpg"},
            {"Redmi Note 7", "hp pertama Redmi setelah menjadi sub-brand Xiaomi, berlayar FHD+ 6.3-inch, dual kamera belakang 48MP+5MP, kamera depan 13MP, baterai 4000 mAh.", "https://d2pa5gi5n2e1an.cloudfront.net/global/images/product/mobilephones/Xiaomi_Redmi_Note_7/Xiaomi_Redmi_Note_7_L_6.jpg"},
            {"Xiaomi Redmi 6A", "berlayar 5.45-inch ditenagai Helio A22 dipadukan varian RAM 2GB/3GB dengan kamera belakang 13MP, kamera depan 5MP, baterai berkapasitas 3000 mAh.", "https://d2pa5gi5n2e1an.cloudfront.net/global/images/product/mobilephones/Xiaomi_Redmi_6A/Xiaomi_Redmi_6A_L_1.jpg"},
            {"Vivo Y93", "berbekal layar LCD HD+ waterdrop notch 6.2-inch dengan tenaga MediaTek Helio P22, kamera depan 8MP, dual kamera belakang 13MP+2MP.", "https://d2pa5gi5n2e1an.cloudfront.net/global/images/product/mobilephones/Vivo_Y93_/Vivo_Y93__L_1.jpg"},
            {"Realme 3", "dibekali layar dewdrop HD IPS LCD 6.22-inch, dibenami MediaTek Helio P60 / Helio P70 dipadukan varian RAM 3GB/4GB, dual kamera belakang 13MP+2MP, kamera depan 13MP, baterai 4230 mAh.", "https://d2pa5gi5n2e1an.cloudfront.net/global/images/product/mobilephones/Realme_3/Realme_3_L_3.jpg"},
            {"OPPO A7", "dengan layar notch waterdrop 6.2-inch berlapiskan Corning Gorilla Glass, ditenagai prosesor Snapdragon 450, berteknologi HyperBoost yang mendukung kelancaran gaming, baterai 4230 mAh.", "https://d2pa5gi5n2e1an.cloudfront.net/global/images/product/mobilephones/OPPO_A7/OPPO_A7_L_1.jpg"},
            {"Vivo V15", "dibekali layar FHD+ 6.53-inch dengan kamera pop-up 32MP, triple kamera di belakang perangkat 12MP+8MP+5MP, Mediatek Helio P70, baterai berkapasitas 4000 mAh.", "https://d2pa5gi5n2e1an.cloudfront.net/global/images/product/mobilephones/Vivo_V15/Vivo_V15_L_3.jpg"},
    };
    public static ArrayList<Android> getListData(){
        ArrayList<Android> list = new ArrayList<>();
        for (String[] aData : data) {
            Android android = new Android();
            android.setName(aData[0]);
            android.setSpec(aData[1]);
            android.setPhoto(aData[2]);
            list.add(android);
        }
        return list;
    }

}
