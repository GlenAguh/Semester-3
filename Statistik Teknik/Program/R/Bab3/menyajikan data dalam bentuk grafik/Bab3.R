#bab3 menyajikan data dalam grafik
library(readxl)
simpan <- read_excel("D:/Kuliah/semester 3/Mata Kuliah/Statistik Teknik/Program/R/Bab3/menyajikan data dalam bentuk grafik/data3.1.csv")

plot(simpan[2:3], main="Pendapatan dan Pengeluaran per-Bulan, dalam Jutaan
Rupiah")

pendapatan = simpan$Pendapatan
pengeluaran = simpan$Pengeluaran
plot(pendapatan, pengeluaran)

library(ggplot2)
PENDAPATAN = simpan$Pendapatan
PENGELUARAN = simpan$Pengeluaran
qplot(PENDAPATAN, PENGELUARAN, main = "Pendapatan dan pengeluaran per-bulan, dalam
jutaan", xlab="pendapatan perbulan", ylab="pengeluaran per-bulan" )



library(ggplot2)
jenis = simpan$JenisKelamin
qplot(PENDAPATAN,PENGELUARAN, main = "pendapatan dan pengeluaran per-bulan
dalam jutaan " , xlab="PENDAPATAN" , ylab = "PENGELURAN" , color=jenis,
shape =jenis)


library(ggplot2)
ggplot(simpan, aes(pendapatan,pengeluaran)) + geom_point()

ggplot(simpan,aes(pendapatan,pengeluaran)) + geom_point(aes(color=jenis,shape=jenis))

grafik <- ggplot(simpan, aes(pendapatan,pengeluaran)) + geom_point(aes(color=jenis,shape=jenis))
grafik + scale_colour_manual(values = c("blue","orange"))

grafik + scale_shape_manual(values = c(16,5))

grafik  + scale_colour_manual(values = c("blue","orange")) + scale_shape_manual(values = c(5,5))
grafik  + facet_grid(.~ JenisKelamin)
grafik  + facet_grid(.~ JenisKelamin) + scale_colour_manual(values = c("blue","orange"))
grafik  + geom_vline(xintercept = 2.5)
grafik  + geom_vline(xintercept = 2.5) + geom_vline(xintercept = 5)
grafik  + geom_vline(xintercept = 1:5)
grafik  + geom_vline(xintercept = c(2.5 , 5 , 7.5))
grafik  + geom_vline(xintercept = c(2.5 , 5 , 7.5), colour="green", linetype="longdash")
grafik  + geom_vline(xintercept = c(2.5 , 5 , 7.5), colour="green", linetype="longdash") +
geom_hline(yintercept = c(2,4,6),colour ="red", linetype = "longdash")









