# Menyajikan Data dengan Diagram Lingkaran

library(readxl)
simpan <- read_excel("D:/Kuliah/semester 3/Mata Kuliah/Statistik Teknik/Program/R/Bab3/menyajikan data dengan diagram lingkaran/data3.5.xlsx")



pie(simpan$jumlah, labels = simpan$produk, main="Data Penjualan Produk A,B,C dan D")

pie(simpan$jumlah, labels = simpan$produk, main="Data Penjualan Produk A,B,C dan D", col=heat.colors(4))

pie(simpan$jumlah, labels = simpan$produk, main="Data Penjualan Produk A,B,C dan D", col=heat.colors(4))
colors=heat.colors(4)
legend(1, 0.5 , c("Produk A", "Produk B", "Produk C", "Produk D"),cex = 0.8, fill = colors )





pie(simpan$jumlah, labels = simpan$produk, main="Data Penjualan Produk A,B,C dan D", 
    col=c("darkblue","orange","yellow","red"))
    colors=c("darkblue","orange","yellow","red")
    legend(1, 0.5 , c("Produk A", "Produk B", "Produk C", "Produk D"), cex = 0.8, fill = colors)




persen=round(simpan$jumlah/sum(simpan$jumlah) * 100,4)
persen=paste(persen, "%", sep="")
pie(simpan$jumlah, labels = persen, main = "Data penjualan produk A,B,C, dan D", 
    col = c("darkblue","orange","yellow","red"))
    colors=c("darkblue","orange","yellow","red")
    legend(1, 0.5 , c("Produk A", "Produk B", "Produk C", "Produk D"), cex = 0.8, fill = colors)


    

    
persen=round(simpan$jumlah/sum(simpan$jumlah) * 100,4)
persen=paste(persen, "%", sep="")
pie(simpan$jumlah, labels = persen, main = "Data penjualan produk A,B,C, dan D", 
    col = c("darkblue","orange","yellow","red"))
    colors=c("darkblue","orange","yellow","red")
    legend(1, 0.5 , c("Produk A", "Produk B", "Produk C", "Produk D"), cex = 0.8, fill = colors)
    
    

jumlah=simpan$jumlah
produk=simpan$produk
library(ggplot2)

pie = ggplot(simpan, aes(x = "", y=jumlah, fill=produk)) + geom_bar(width=1, stat="identity") + coord_polar("y", start = 0)

pie

library(ggplot2)
library(grid)
library(gridExtra)


blank_theme = theme(
  axis.title.x = element_blank(),
  axis.title.y = element_blank(),
  axis.text.x = element_blank(),
  axis.text.y = element_blank(),
  panel.border = element_blank(),
  panel.grid =  element_blank(),
  axis.ticks = element_blank(),
  plot.title = element_text(size = 14, face = "bold")
)




library(scales)

pie + blank_theme + geom_text(aes(y = jumlah/4 + c(0,cumsum(jumlah)[-length(jumlah)]), label=jumlah ), size=5)

pie + blank_theme + geom_text(aes(y = jumlah/4 + c(0,cumsum(jumlah)[-length(jumlah)]), label=jumlah ), size=5) + scale_fill_manual(values = c(heat.colors(4)))


persen = round(simpan$jumlah / sum(simpan$jumlah) * 100,2)
pesen = paste(persen, "%", sep = "")
pie + blank_theme + geom_text(aes(y = jumlah / 4 + c(0,cumsum(jumlah)[-length(jumlah)]),
    label=persen), size=5) + 
    scale_fill_manual(values = c(heat.colors(4)))

    
    
    
    
    
    
    
    
    
    