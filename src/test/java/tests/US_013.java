package tests;

import org.testng.annotations.Test;
import pages.UserHomePage;

public class US_013 {


    UserHomePage userHomePage = new UserHomePage();


    @Test
    public void TC_1301(){
        //Kayitli kullanici ilgili Url ile anasayfaya gider.
        //Header bolumundeki sign in butonuna tiklar ve login sayfasina gider.
        //Kullanici, ilgili kutulara sistemde kayitli  mail ve password'unu girerek sign in butonuna tiklar.
        //Anasayfanin goruldugu dorulanir.
        //Anasayfa bodysinde bulunan "Popular Doctors" bolumunden istenilen bir dotora tiklar.
        //"Appointment Booking " yazisinin goruntulendigi dogrulanir.
        //Kullanici acilan sayfada randevu tarihini secer, "phone" kutusuna telefon numarasi ekler, ilgili saglik deparmanini ve doktoru sectikten sonra "Appointment Booking" e tiklar.
        //"Congratulations on your well-deserved success." yazisinin gorundugu dogrulanir.


    }

    @Test
    public void TC_1302(){
        //Kayitli kullanici ilgili Url ile anasayfaya gider.
        //Header bolumundeki sign in butonuna tiklar ve login sayfasina gider.
        //Kullanici, ilgili kutulara sistemde kayitli  mail ve password'unu girerek sign in butonuna tiklar.
        //Anasayfanin goruldugu dorulanir.
        //Anasayfa bodysinde bulunan "Popular Doctors" bolumunden istenilen bir dotora tiklar.
        //"Leave a Review" yazisinin goruldugu dogrulanir.
        //Kullanici "Rating" dropdown menusune tiklar ve puanlama yapar.
        //Kullanici "Your Review" text alanina tiklar ve feedback yazar.
        //"Submit" butonuna tiklanir.
        //"Congratulations on your well-deserved success." yazisinin gorundugu dogrulanir.


    }
    @Test
    public void TC_1303(){
        //Kayitli kullanici ilgili Url ile anasayfaya gider.
        //Header bolumundeki sign in butonuna tiklar ve login sayfasina gider.
        //Kullanici, ilgili kutulara sistemde kayitli  mail ve password'unu girerek sign in butonuna tiklar.
        //Anasayfanin goruldugu dorulanir.
        //Anasayfa bodysinde bulunan "Popular Doctors" bolumunden istenilen bir dotora tiklar.
        //"Leave a Review" yazisinin goruldugu dogrulanir.
        //Kullanici "Rating" dropdown menusunden herhangi bir degeri secmez.
        //Kullanici "Your Review" text alanina herhangi bir metin girmez.
        //"Submit" butonuna tiklanir.
        //"Congratulations on your well-deserved success." yazisinin goruntulenmedigi ve hata bildirimi alindigi dogrulanir.


    }















}
