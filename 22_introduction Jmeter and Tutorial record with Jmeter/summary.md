jMeter atau The Apache JMeterTM adalah aplikasi open source berbasis Java yang dapat dipergunakan untuk performance test. Bagi seorang QA Engineer jMeter bisa digunakan untuk melakukan load/stress testing Web Application, FTP Application dan Database server test.

jMeter bisa dijalankan dengan 2 cara, dengan GUI atau non-GUI ( Command line ). Untuk beginner lebih baik saya sarankan menggunakan cara yang pertama. Mudah dan tanpa melakukan scripting tertentu. Tinggal membuat Test Plan, mengisikan berapa thread & sample yang akan diujicobakan, running dan menganalisa hasil/report.
JMeterPlugins-Standard. Cara menambahkan : ekstrak > kopikan seluruh isi lib\ext ke dalam folder lib\ext dari apache-jmeter.
JMeterPlugins-Extras. Cara menambahkan : ekstrak >  kopikan seluruh isi bin ke dalam folder bin apache-jmeter, kopikan seluruh isi lib\ext\ ke dalam folder lib\ext\ dari apache-jmeter. Taruh file/folder lain ke dalam root apache-jmeter.
ServerAgent. Ekstrak dan pisahkan dari direktori jMeter atau taruh di luar folder jMeter.
Lakukan hal yang sama untuk plugin lain.
MEMBUAT PERFORMANCE TEST PLAN

Setelah jMeter sudah berhasil dibuka, selanjutnya kita bisa menyiapkan Test plan.

1.Add Thread Group
menambahkan trafik/user visitor ke dalam komponen yang mau di test. Langkahnya :

Klik Kanan Test Plan
Add >Threads ( Users ) > Thread Group
Dalam kontrol panel Thread Group, Entri pada Thread Properties :
– Number of threads (users) : isi berapa user/visitor yang akan mengakses web.
– Ramp-Up period ( in seconds ) : isi berapa waktu delay antara user satu dengan yang lainnya dalam mengakses web.
– Loop Count : waktu eksekusi, bertahap atau seterusnya.
2. Add jMeter Element
Menambahkan web server/IP Address yang akan ditest. Caranya :

Klik Kanan Threads Group
Add > Config Element > HTTP Request Defaults
Pada Web Server isi Server Name atau IP dan Portnya, atau gampangnya isi website/url yang akan ditest. URL diisi dengan format http://www.
Jika tidak hanya halaman utama yang di test, kita bisa menambahkan path/foldernya, caranya :
1. Klik Kanan Threads Group
2. Add > Sampler > HTTP Request
3. Isi web server, port dan path
3. Add Listener
Menampilkan proses dan hasil test secara grafis atau bentuk tabel. Caranya :

Klik Kanan Test Plan
Add > Listener > Graph Result
Add > Listener > View Results in Table
4. Run Test
Menjalankan Test secara otomatis. Caranya :

Simpan terlebih dahulu Test Plan yang telah kita buat di File > Save ( Ctrl + S ).
Klik Run atau Ctrl + R, jMeter akan mulai mensimulasi sejumlah user dalam mengakses web server yang telah ditentukan.