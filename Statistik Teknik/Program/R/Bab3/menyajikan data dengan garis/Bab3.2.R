#bab 3 menyajikan data dengan garis
library(readxl)
simpan <- read_excel("D:/Kuliah/semester 3/Mata Kuliah/Statistik Teknik/Program/R/Bab3/menyajikan data dengan garis/data3.2.xlsx")

Tahun = simpan$tahun
jumlah_A = simpan$jenis.barang.A
jumlah_B = simpan$jenis.barang.B
jumlah_C = simpan$jenis.barang.C

jumlah_A
jumlah_B
jumlah_C 

plot(Tahun,jumlah_A)#

plot(Tahun,jumlah_A, type="o")#

plot(Tahun,jumlah_A, type="o", col="blue")#

plot(Tahun,jumlah_A, type="o", col="green")#

plot(Tahun,jumlah_A, type="o", col="red")#
lines(Tahun, jumlah_B, type="o", col="blue")#


plot(Tahun,jumlah_A, type="o", col="red",ylim=c(70,180))#
lines(Tahun, jumlah_B, type="o", col="blue")#



plot(Tahun,jumlah_A, type="o", col="red",ylim=c(40,180))#
lines(Tahun, jumlah_B, type="o", col="blue")#
lines(Tahun,jumlah_C, type="o", col="green")#




plot(Tahun,jumlah_A, type="o", col="red",ylim=c(40,180))#
lines(Tahun, jumlah_B, type="o",pch=22,lty=2 ,col="blue")#
lines(Tahun,jumlah_C, type="o", col="green")#




plot(Tahun,jumlah_A, type="o",col="red",ylim=c(40,180))#
lines(Tahun, jumlah_B, type="o",pch=22,lty=2,col="blue")#
lines(Tahun,jumlah_C ,type="o", col="green")#



plot(Tahun,jumlah_A, type="o",col="red",ylim=c(40,180))#
lines(Tahun, jumlah_B, type="o",pch=22,lty=2,col="blue")#
lines(Tahun,jumlah_C ,type="o", col="green")#




plot(Tahun,jumlah_A, type="o",pch=22,lty=2 ,col="red",ylim=c(40,180))#
lines(Tahun, jumlah_B, type="o",pch=22,lty=2 ,col="blue")#
lines(Tahun,jumlah_C,pch=22,lty=2 ,type="o", col="green")#





plot(Tahun,jumlah_A, type="p",pch=22,lty=2 ,col="red",ylim=c(40,180))#
lines(Tahun, jumlah_B, type="p",pch=22,lty=2 ,col="blue")#
lines(Tahun,jumlah_C,pch=22,lty=2 ,type="p", col="green")#





plot(Tahun,jumlah_A, type="o",pch=22,lty=2 ,col="red",ylim=c(40,180))#
lines(Tahun, jumlah_B, type="p",pch=22,lty=2 ,col="blue")#
lines(Tahun,jumlah_C,pch=22,lty=2 ,type="l", col="green")#




plot.new()
plot(Tahun,jumlah_A,type="o", col="red", ylim=c(40,180) )#
lines(Tahun,jumlah_B, type="o" ,col="blue")#
lines(Tahun,jumlah_C, type="o" ,col="green")#
title(main = "Data penjualan barang A,B,C, dari Tahun 2001 - 2007", col.main="red", font.main=4)#





Total = jumlah_A
plot.new()
plot(Tahun,Total,type="o", col="red", ylim=c(40,180) )#
lines(Tahun,jumlah_B, type="o" ,col="blue")#
lines(Tahun,jumlah_C, type="o" ,col="green")#
title(main = "Data penjualan barang A,B,C, dari Tahun 2001 - 2007", col.main="red", font.main=4)#






Total = jumlah_A
plot.new()
plot(Tahun,Total,type="o", col="red", ylim=c(40,180) )#
lines(Tahun,jumlah_B, type="o" ,col="blue")#
lines(Tahun,jumlah_C, type="o" ,col="green")#
legend(2001,160,c("Jenis barang A", "Jenis Barang B","Jenis Barang C"),cex=0.8, col=c("red","blue","green"),pch=21)#
title(main = "penjualan barang A,B,C, dari Tahun 2001 - 2007", col.main="red", font.main=4)#






Total = jumlah_A
plot.new()
plot(Tahun,Total,type="o", col="red", ylim=c(40,180) )#
lines(Tahun,jumlah_B, type="o" ,col="blue")#
lines(Tahun,jumlah_C, type="o" ,col="green",lty=23)#
legend(2001,160,c("Jenis barang A", "Jenis Barang B","Jenis Barang C"),cex=0.8, col=c("red","blue","green"),lty=30)#
title(main = "penjualan barang A,B,C, dari Tahun 2001 - 2007", col.main="red", font.main=4)#  






Total = jumlah_A
plot.new()
plot(Tahun,Total,type="o", col="red", ylim=c(40,180) )#
lines(Tahun,jumlah_B, type="o" ,col="blue", lty=23)#
lines(Tahun,jumlah_C, type="o" ,col="green",lty=23)#
legend(2001,160,c("Jenis barang A", "Jenis Barang B","Jenis Barang C"),cex=0.8, col=c("red","blue","green"),lty=30)#
title(main = "penjualan barang A,B,C, dari Tahun 2001 - 2007", col.main="red", font.main=4)#







Total = jumlah_A
plot.new()
plot(Tahun,Total,type="o", col="red", ylim=c(40,180),lty=23 )#
lines(Tahun,jumlah_B, type="o" ,col="blue", lty=23)#
lines(Tahun,jumlah_C, type="o" ,col="green",lty=23)#
legend(2001,160,c("Jenis barang A", "Jenis Barang B","Jenis Barang C"),cex=0.8, col=c("red","blue","green"),lty=30)#
title(main = "penjualan barang A,B,C, dari Tahun 2001 - 2007", col.main="red", font.main=4)#






Total = jumlah_A
plot.new()
plot(Tahun,Total,type="o", col="red", ylim=c(40,180),lty=23 )#
lines(Tahun,jumlah_B, type="s" ,col="blue", lty=23)#
lines(Tahun,jumlah_C, type="o" ,col="green",lty=23)#
legend(2001,160,c("Jenis barang A", "Jenis Barang B","Jenis Barang C"),cex=0.8, col=c("red","blue","green"),lty=30)#
title(main = "penjualan barang A,B,C, dari Tahun 2001 - 2007", col.main="red", font.main=4)#






Total = jumlah_A
plot.new()
plot(Tahun,Total,type="o", col="red", ylim=c(40,180),lty=23 )#
lines(Tahun,jumlah_B, type="l" ,col="blue", lty=23)#
lines(Tahun,jumlah_C, type="o" ,col="green",lty=23)#
legend(2001,160,c("Jenis barang A", "Jenis Barang B","Jenis Barang C"),cex=0.8, col=c("red","blue","green"),lty=30)#
title(main = "penjualan barang A,B,C, dari Tahun 2001 - 2007", col.main="red", font.main=4)#





Total = jumlah_A
plot.new()
plot(Tahun,Total,type="o", col="red", ylim=c(40,180))#
lines(Tahun,jumlah_B, type="l" ,col="blue", lty=23)#
lines(Tahun,jumlah_C, type="o" ,col="green",lty=23)#
legend(2001,160,c("Jenis barang A", "Jenis Barang B","Jenis Barang C"),cex=0.8, col=c("red","blue","green"),lty=30)#
title(main = "penjualan barang A,B,C, dari Tahun 2001 - 2007", col.main="red", font.main=4)#






Total = jumlah_A
plot(Tahun,Total, type="o", col="red", ylim=c(40,180), xaxt="n")#
Axis(at = 2001:2007,side = 1, labels = c("A","B","C","D","E","F","G"))#
lines(Tahun,jumlah_B, type="l" ,col="blue", lty=23)#
lines(Tahun,jumlah_C, type="o" ,col="green",lty=23)#
legend(2001,160,c("Jenis barang A", "Jenis Barang B","Jenis Barang C"),cex=0.8, col=c("red","blue","green"),lty=30)#
title(main = "penjualan barang A,B,C, dari Tahun 2001 - 2007", col.main="red", font.main=4)#






Total = jumlah_A
plot.new()
plot(Tahun,Total, type="o", col="red", ylim=c(40,180))#
lines(Tahun,jumlah_B, type="l" ,col="blue", lty=23)#
lines(Tahun,jumlah_C, type="o" ,col="green",lty=23)#
legend(2001,160,c("Jenis barang A", "Jenis Barang B","Jenis Barang C"),cex=0.8, col=c("red","blue","green"),lty=30)#
title(main = "penjualan barang A,B,C, dari Tahun 2001 - 2007", col.main="red", font.main=4)#






Total = jumlah_A
plot(Tahun,Total, type="o", col="red", ylim=c(40,180), xaxt="n")#
Axis(at = 2001:2007,side = 1, labels = c("A","B","C","D","E","F","G"))#
lines(Tahun,jumlah_B, type="l" ,col="blue", lty=23)#
lines(Tahun,jumlah_C, type="o" ,col="green",lty=23)#
legend(2001,160,c("Jenis barang A", "Jenis Barang B","Jenis Barang C"),cex=0.8, col=c("red","blue","green"),lty=30)#
title(main = "penjualan barang A,B,C, dari Tahun 2001 - 2007", col.main="red", font.main=4)#






Total = jumlah_A
plot(Tahun,Total, type="o", col="red", ylim=c(40,180), xaxt="n")#
Axis(at = 2001:2007,side = 1, labels = c("Tahun 1","Tahun 2","Tahun3","Tahun 4","Tahun 5","Tahun 6", "Tahun 7"))#
lines(Tahun,jumlah_B, type="l" ,col="blue", lty=23)#
lines(Tahun,jumlah_C, type="o" ,col="green",lty=23)#
legend(2001,160,c("Jenis barang A", "Jenis Barang B","Jenis Barang C"),cex=0.8, col=c("red","blue","green"),lty=30)#
title(main = "penjualan barang A,B,C, dari Tahun 2001 - 2007", col.main="red", font.main=4)#






Total = jumlah_A
plot(Tahun,Total, type="o", col="red", ylim=c(40,180), xaxt="n")
Axis(at = 2001:2007,side = 3, labels = c("Tahun 1","Tahun 2","Tahun3","Tahun 4","Tahun 5","Tahun 6", "Tahun 7"))
lines(Tahun,jumlah_B, type="l" ,col="blue", lty=23)
lines(Tahun,jumlah_C, type="o" ,col="green",lty=23)
legend(2001,160,c("Jenis barang A", "Jenis Barang B","Jenis Barang C"),cex=0.8, col=c("red","blue","green"),lty=30)
title(main = "penjualan barang A,B,C, dari Tahun 2001 - 2007", col.main="red", font.main=4)











