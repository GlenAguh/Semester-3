simpan = c (10,20,40,15,40)
simpan
simpan = c(1000,2000,3000,4000,5000)
simpan

simpan = c (10,20,40,15,40)
simpan [3]
simpan [4]
simpan [c(1,3,4)]
simpan [2:4]

simpan [3] = 100
simpan [4] = 1000
simpan



nilai=c(10, 40, 45, 30, 80)
nilai = nilai[-3]
nilai = nilai [-4]
nilai = nilai [c(-1,-3)]
nilai




nilai=c(100, 95, 70, 80, 25, 60, 80, 60, 55, 90)
nilai [nilai>80]

nilai [nilai<70]

nilai [nilai>60 & nilai<80]
nilai [nilai>80 | nilai<30]


nilai = nilai [nilai < 75]
nilai


nilai=c(100, 95, 70, 80, 25, 60, 80, 60, 55, 90)
nilai = nilai [nilai > 90]
nilai





fungsi = function(x)
{
  for(i in 1:length(x)){
    if(x[i]<65)
    {
      x[i] = x[i] + 10;
    }
    print(x[i])
  }
}

A=c(100, 95, 70, 80, 25, 60, 80, 60, 55, 90)
fungsi(A)







mode(1000)
simpan = c(1000)
mode(simpan)



#karakter
mode("Hallo")
simpan = c("halllo")
mode(simpan)



#true dan false
d = c(F)
d
a = c(T)
a 
mode(d)
mode(a)





#Kuadrat
kuadrat = function(x)
{
  print(x*x)
}
a = c(5)
kuadrat(a)
mode(kuadrat)








A = c(1,2,3)
B = c(4,5,6)
C = A+B
C

A = c(1,2,3)
B = 2 + A
B


A = c(2,4,6)
B = c(1,3,5)
B - A

A = c(4,8,12)
A * 0.5


A = c(4,8,12)
B = c(2,2,2)
A / B


A =c(3,6,1)
B = c(2,2,0)
A^B



Z =c(5,2,7)
Y = c(3,2,6)
X = Z %% Y
X



A = c(100,70,80,55,80,70,80)
length(A)


A=c(70,80,50,25,100,60)
sort(A)


A=c(100,50,70,80,60)
diff(A)


A=c(50,60,70,80)
sum(A)


a = sqrt(81)
a 
b = sqrt(a)
b
b = sqrt(a)
  


A=c(10,25,90,75,95,57)
max(A)

A=c(10,25,90,75,95,57)
min(A)


exp(1)
exp(2)


pi

options(digits=3)
pi

options(digits=10)
pi



seq(from=1, to=10)
seq(from=2, by=0.5, length.out=4)


#kelipatan 3
panggil=function(x,y,z)
{
  a=x;
  print(a);
  for(i in x : z)
  {
    a=a+y;
    if(a>z)
    {
      break;
    }
    print(a);
  }
}
panggil(2,3,30)


#cara lain
seq(2,30,3)



A=c(10, 10, 30, 10, 30, 10, 10, 40, 40,70, 90, 70, 80, 60, 60, 90)
table(A)
A=c(10, 10, 30, 10, 30, 10, 10, 40, 40,70, 90, 70, 80, 60, 60, 90)
table(A)/length(A)

hasil = c("ya", "tidak","ya","ya","ya","ya","tidak","ya","tidak","ya")
table(hasil)
table(hasil) / length(hasil)


A=c("ikan", "ikan", "udang","ikan", "udang", "ikan", "ikan","udang")
factor(A)

A=c("sarjana","diploma", "sarjana", "pengangguran", "sarjana", "diploma",
     "diploma", "pengangguran")
factor(A)





A=c(10, 10, 10, 10, 20, 20, 30, 30, 30, 30, 30, 30)
barplot(table(A))

A=c(10, 10, 10, 10, 20, 20, 30, 30, 30, 30, 30, 30)
barplot(table(A)/length(A))


A = c(10,10,10,10,20,20,30,30,30,30,30,30)
barplot(table(A))
barplot(table(A) / length(A))



A=c(10,10,10,10,10,20,20,20,30,30,40)
table(A)
nilai=c(10,20,30,40)
frekuensi=c(5,3,2,1)
plot(nilai,frekuensi)
A=c(10,10,10,10,10,20,20,20,30,30,40)
plot(table(A))
















