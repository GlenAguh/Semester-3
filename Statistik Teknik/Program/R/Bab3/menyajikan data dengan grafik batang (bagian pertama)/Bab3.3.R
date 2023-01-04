#Bab 3  Menyajikan data dengan grafik batang (bagian pertama)

library(readxl)
simpan <- read_excel("D:/Kuliah/semester 3/Mata Kuliah/Statistik Teknik/Program/R/Bab3/menyajikan data dengan grafik batang (bagian pertama)/data3.3.xlsx")


Tahun = simpan$tahun
jumlah_A = simpan$jenis.barang.A

barplot(jumlah_A,Tahun, main="Penjualan barang jenis A dari Tahun 2001-2007", xlab="Tahun",
        ylab="Jumlah barang yang terjual", names.arg=c("2001","2002","2003","2004","2005","2006","2007"))


barplot(jumlah_A,Tahun, main="Penjualan barang jenis A dari Tahun 2001-2007", xlab="Tahun",
        ylab="Jumlah barang yang terjual", names.arg=c("2001","2002","2003","2004","2005","2006","2007"))


barplot(jumlah_A,Tahun, main="Penjualan barang jenis A dari Tahun 2001-2007", xlab="Tahun",
        ylab="Jumlah barang yang terjual", names.arg=c("2001","2002","2003","2004","2005","2006","2007"), border="blue")


barplot(jumlah_A,Tahun, main="Penjualan barang jenis A dari Tahun 2001-2007", xlab="Tahun",
        ylab="Jumlah barang yang terjual", names.arg=c("2001","2002","2003","2004","2005","2006","2007"), border="red")


barplot(jumlah_A,Tahun, main="Penjualan barang jenis A dari Tahun 2001-2007", xlab="Tahun",
        ylab="Jumlah barang yang terjual", names.arg=c("2001","2002","2003","2004","2005","2006","2007"), border="green",
        density=c(10,20,30,40,50,60,70))



library(ggplot2)
ggplot(data = simpan , aes(x = Tahun, y = jumlah_A)) + geom_bar(stat="identity")
ggplot(data = simpan , aes(x = Tahun, y = jumlah_A)) + geom_bar(stat="identity", fill="darkblue")
ggplot(data = simpan , aes(x = Tahun, y = jumlah_A)) + geom_bar(stat="identity", fill=heat.colors(7))













