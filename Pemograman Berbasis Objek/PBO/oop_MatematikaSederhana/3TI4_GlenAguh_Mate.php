<?php
class Matematika
{
    public function setOperasi(int $bilangan1, int $bilangan2, string $operasi)
    {
        if ($operasi == 'tambah') {
            $this->hasil = $bilangan1 + $bilangan2;
            $this->info = $bilangan1 . ' + ' . $bilangan2;
        } else if ($operasi == 'kurang') {
            $this->hasil = $bilangan1 - $bilangan2;
            $this->info = $bilangan1 . ' - ' . $bilangan2;
        } else if ($operasi == 'bagi') {
            $this->hasil = $bilangan1 / $bilangan2;
            $this->info = $bilangan1 . ' / ' . $bilangan2;
        } else if ($operasi == 'kali') {
            $this->hasil = $bilangan1 * $bilangan2;
            $this->info = $bilangan1 . ' * ' . $bilangan2;
        }
        return $this->hasil;
    }

    public function getInfo()
    {
        $info = $this->info;
        return $info;
    }

    public function getOperasi()
    {
        $hasil = $this->hasil;
        return $hasil;
    }
}


$matematika = new Matematika;

if (isset($_POST['submit'])) {
    $matematika->setOperasi($_POST['bilangan1'], $_POST['bilangan2'], $_POST['operasi']);
    $info = $matematika->getInfo();
    $result = $matematika->getOperasi();
}

?>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>PHP Matematika Sederhana</title>

    <style>
        body{
            background-color: #4FA095;
            font-family: 'Courier New', Courier, monospace;
            color: #fff
        }

        .container {
            width: 20%;
            margin: auto;
            border: 1px solid #111;
            padding: 10px;
        }

        #input {
            font-size: 20px;
        }
    </style>
</head>

<body>
    <h1 style="text-align: center">Matematika Sederhana</h1>

    <div class="container">
        <form action="" method="post">

        <!-- Input Bilangan -->
            <p>Bilangan 1 <input type='text' name='bilangan1' /></p>
            <p>Bilangan 2 <input type='text' name='bilangan2' /></p>


            <!-- Kurang -->
            <p><input type="radio" name="operasi" value="kurang"> - <span id="input">Pengurangan</span></p>

            <!-- Kali -->
            <p><input type="radio" name="operasi" value="kali"> * <span id="input">Perkalian</span></p>

            <!-- Tambah -->
            <p><input type="radio" name="operasi" value="tambah"> + <span id="input">Penjumlahan</span></p>

            <!-- Bagi -->
            <p><input type="radio" name="operasi" value="bagi"> / <span id="input">Pembagian</span></p>

            <input style="width: 100%" type='submit' name='submit' value='='>
            <?php if (isset($result)) : ?>
                <p><?= $info . " = " . $result; ?></p>
            <?php endif ?>
        </form>
    </div>
</body>

</html>