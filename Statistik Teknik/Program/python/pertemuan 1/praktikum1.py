import statistics
print ("hello gais")
a = [1,2,1,3,4,1,5,6,1,98,79,3,3,3,3]
print (sum(a), "Banyak nya data : ",len(a))
print ("banyaknya angka 1 adalah", a.count(1))
print ("Rata-rata = ",statistics.mean(a))
print ("Nilai tengah = ",statistics.median(a))
print ("Nilai modus = ",statistics.mode(a))
