

library(readxl)
simpan <- read_excel("D:/Kuliah/semester 3/Mata Kuliah/Statistik Teknik/Program/R/Bab3/Menyajikan Data dengan Histogram/IQ.xlsx")



simpan_skor_IQ=simpan$IQ
hist(simpan_skor_IQ)

hist(simpan_skor_IQ, col="lightblue")

hist(simpan_skor_IQ, col="darkblue", ylim=c(0,40), main="contoh Histogram", ylab="Frekuensi")

hist(simpan_skor_IQ, col="orange", ylim=c(0,40), main="contoh Histogram", ylab="Frekuensi", breaks=c(90,100,110,120))

hist(simpan_skor_IQ, col=heat.colors(6), ylim=c(0,30), main="contoh Histogram", ylab="Frekuensi",
     breaks=c(90,95,100,105,110,115,120), xlim=c(90,125))

hist(simpan_skor_IQ, col=heat.colors(6), ylim=c(0,30), main="contoh Histogram", ylab="Frekuensi",
     breaks=c(90,93,96,99,102,105,108,111,114,117,120), xlim=c(90,125))

hist(simpan_skor_IQ, breaks=6, col=heat.colors(6), ylim=c(0,30), main="contoh Histogram",
     ylab="Frekuensi", xlim=c(90,125))

hist(simpan_skor_IQ, breaks=c(90,117,120), ylim=c(0,50), xlim=c(90,125), main="contoh Histogram",
     col=heat.colors(2))

hist(simpan_skor_IQ, breaks=c(90,117,120), ylim=c(0,80), xlim=c(90,125), main="contoh Histogram",
     col=heat.colors(2), freq=TRUE)

hist(simpan_skor_IQ, breaks=c(90,92,97,117,120), ylim=c(0,80), xlim=c(90,125), main="contoh Histogram",
     col=heat.colors(4), freq=TRUE)

library(ggplot2)

ggplot(data=simpan, aes(IQ)) + geom_histogram(breaks=c(90,95,100,105,110,115,120), col="darkblue",
      fill=heat.colors(6))

ggplot(data=simpan, aes(IQ)) + geom_histogram(breaks=c(90,95,100,105,110,115,120), col="red",
      aes(fill=..count..)) + labs(title="Contoh Histogram") + labs(x="IQ", y="Jumlah") +
      xlim(c(90,125)) + ylim(c(0,20)) + scale_fill_gradient("count", low="green", high="red")

library(ggplot2)

ggplot(data=simpan, aes(IQ)) + geom_histogram(breaks=c(90,93,96,99,102,105,111,114,115,120),
      col="darkblue", fill=heat.colors(9), aes(fill=..count..)) + labs(title="Contoh Histogram") +
      labs(x="IQ", y="Jumlah") + xlim(c(90,125)) + ylim(c(0,20)) + scale_fill_gradient("Count",
      low=heat.colors(9), high=heat.colors(9))

