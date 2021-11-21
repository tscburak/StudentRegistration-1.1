# StudentRegistration-1.1
That is the updated version of first StudentRegistration project

Linkedin Post: https://bit.ly/30NqgH6

-----------------------------------------------------------------------------------------------------------------------------------


# **[TR]**
## Güncelleme Notları:


  **Genel Olarak**:
   - Artık seçili panelin butonu diğerine göre daha koyu renkte.
   - Daha temiz bir kod yazmaya çalıştım. Bu yüzden özel metodlar için de class'lar oluşturdum. Ancak hâlâ main class biraz karmaşık.

  **Kayıt Ekranı İçin**:
   - Programı daha dinamik bir hale getirmeye çalıştım. textField'lara ActionListener ekledim. Listener'lar buradaki tüm olayları dinliyor ve sürekli şartları kontrol ediyor.
      Örneğin: Kullanıcı name & surname & mail alanlarını doldurduğunda "Kaydet" butonu aktif oluyor. 
  
   - Kullanıcı bir öğrenci eklediğinde veya güncellediğinde kayıt formundaki tüm bilgiler sıfırlanıyor.
    
   - Telefon Numarası kutucuğuna girilen veri 11 haneyi geçmiyor.

   - Puan ve Sıralama kutucuğuna virgül (,) değeri girilirse otomatik olarak nokta(.) değerine dönüştürülüyor.

   - Puan verisini sadece sayısal alabilmek için, artık puan kutucuğuna sayısal olmayan değerler girilemiyor. 


   **Öğrenciler Ekranı İçin**:
   - Seçili öğrencinin detaylı bilgilerini görüntülemek için "Detayları Göster" butonu ekledim.
   
   - Tablonun görünüşünü biraz değiştirdim. Bazı satırları kestim ve daha özet verileri göstermeye çalıştım. Eğer öğrenci daha detaylı bilgileri görmek isterse "Detayları Göster"
    butonuna tıklayıp detayları çıkan ekrandan inceleyebilir.
      
   - Kullanıcı checkBox'lardan birini seçmedikçe ve arama kutucuğuna bir yazı yazmadığı sürece "Ara" butonu aktif olmuyor.
      
   - Kullanıcı, tablodan bir öğrenci seçtiği takdirde Sil & Düzenle & Detayları Göster butonları aktif oluyor.
   



-----------------------------------------------------------------------------------------------------------------------------------




# **[EN]**
## Update Notes:


  **For General:**
   - Selected panel button is more dark than the other one anymore.
   - I tried to make more clean than the previous one. That is why add more class for specific function. However the main class is still kind of complicated.

  **For Registration Screen:**
   - I tried to do more dinamic the program. I added ActionListener to textFields. The listeners, listen all event on textFields and they check the conditions.
      For example: When the user fill name & surname & mail fields the save button will be active. 
  
   - When the user add & update a student, the information which in textFields will be deleted.
    
   - There will not be more than 11 digits in "Phone Number" field.

   - If the user type comma (,) to "Score" and "Priority" fields, it will be convert to point(.) automatically.

   - The user not able to type values which is not integer values in "Score" field. 

   **For Students Screen:**
   - Added "More Details" button to see more information about the selected student. 
   
   - Changed the table view. Cutted some columns and tried to show summary data on table. If the users want to see details about the student, they can click "More Detail" button
    and they can see the details.
      
   - Unless the user choose an checkBox and write some text on search textField, Search button will not be active.
      
   - When the user select a student from the table, then delete & edit & more details buttons will be active.
   

