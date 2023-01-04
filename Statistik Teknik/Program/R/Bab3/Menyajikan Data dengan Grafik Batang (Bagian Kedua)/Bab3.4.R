#Bab 3  Menyajikan data dengan grafik batang (bagian kedua)

library(readxl)
simpan <- read_excel("D:/Kuliah/semester 3/Mata Kuliah/Statistik Teknik/Program/R/Bab3/Menyajikan Data Dengan Grafik Batang (Bagian Kedua)/data3.4.xlsx")

frekuensi = c(90,10,25,75)
barplot(t(matrix(frekuensi, ncol = 2, byrow = TRUE, dimnames = list(c("Laki-Laki", "Perempuan"), c("Olahraga", "Memasak")))),
        main="Hubungan antara jenis kelamin dan hobi", xlab="Jenis Kelamin",
        col=c("darkblue", "orange"), beside=TRUE, ylim=c(0,150), legend.text=TRUE,
        args.legend=list(x="topright"))


frekuensi2 = c(2,12,16,6)
barplot(frekuensi2, ylim=c(0,20), main="Jumlah mahasiswa memperoleh nilai A,B,C, dan D, untuk matakuliah matematika 1",
        names.arg=c("A","B","C","D"), ylab="Jumlah Mahasiswa",
        xlab="Nilai Mahasiswa", cex.names=0.8, col=c("green","yellow","orange","red") )



dat = data.frame(
  jenis_kelamin=factor(c("Laki-laki", "Perempuan"), levels = c("Laki-laki","Perempuan")),Total=c(20,70))


dat 


library(ggplot2)
ggplot(data=dat,aes(x=jenis_kelamin, y=Total)) + geom_bar(stat="identity")
ggplot(data=dat,aes(x=jenis_kelamin, y=Total, fill=jenis_kelamin)) + geom_bar(stat="identity") + guides(fill=FALSE)
ggplot(data=dat,aes(x=jenis_kelamin, y=Total, fill=jenis_kelamin)) + geom_bar(stat="identity") + 
  xlab("Jenis Kelamin") + ylab("Jumlah Mahasiswa") + ggtitle ("Polimdo")




dat = data.frame(jenis_kelamin=factor(c("Laki-laki","Laki-laki","Perempuan","Perempuan")),
                 hobi=factor(c("Olahraga","Memasak", "Olahraga","Memasak"), levels = c("Olahraga","Memasak")),Total=c(80,20,40,60))


dat


ggplot(data=dat, aes(x=hobi, y=Total, fill=jenis_kelamin)) + geom_bar(stat="identity") + 
  xlab("Hobi Mahasiswa") + ylab("Jumlah Mahasiswa") + ggtitle("Polimdo") + 
  geom_text(aes(y=Total / 1.3 , label=Total), position="stack")



ggplot(data=dat, aes(x=hobi, y=Total, fill=jenis_kelamin)) + geom_bar(stat="identity",position=position_dodge()) +
    xlab("Hobi Mahasiswa") + ylab("Jumlah Mahasiswa") + ggtitle("Polimdo")




ggplot(data=dat, aes(x=hobi, y=Total, fill=jenis_kelamin)) + geom_bar(stat="identity",position=position_dodge()) +
   xlab("Hobi Mahasiswa") + ylab("Jumlah Mahasiswa") + ggtitle("Polimdo") + geom_text(aes(y=Total / 4, label=Total),
      position=position_dodge(width=1) )






















