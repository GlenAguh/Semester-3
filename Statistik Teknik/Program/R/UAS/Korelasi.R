library(readxl)
data <- read_excel("D:/Kuliah/semester 3/Mata Kuliah/Statistik Teknik/Program/R/UAS/Studi Kasus Korelasi.xlsx")
View(data)

qqnorm(data$harga)
qqline(data$harga)

qqnorm(data$penjualan)
qqline(data$penjualan)

shapiro.test(data$harga)
shapiro.test(data$penjualan)


cor.test(Studi_kasus_korelasi$penjualan,Studi_kasus_korelasi$harga,method = "pearson")

