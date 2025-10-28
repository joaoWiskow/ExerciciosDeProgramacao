<?php

$x=$argv[1]?? 0;
$y=$argv[2]?? 0;
$op=$argv[3]?? "";


// if($op=="+"){
//     echo "Resultado: ".soma($x,$y)+ "<br>";
// }
// elseif($op=="-"){
//     echo "Resultado: ".sub($x,$y)+ "<br>";
// }
// elseif($op=="x"){
//     echo "Resultado: ".mul($x,$y)+ "<br>";
// }
// elseif($op=="/"){
//     echo "Resultado: ".div($x,$y)+ "<br>";
// }
// else{
//     echo "Operador não é válido <br>";
// }
switch($op){
    case "+":
        echo soma($x,$y)."<br>";
        break;
    case "-":
        echo sub($x,$y)."<br>";
        break;
    case "x":
        echo mul($x,$y) ."<br>";
        break;
    case "/":
        echo div($x,$y). "<br>"; 
        break;
    default:
        echo "Sem operador válido <br>";
        break;
}

function soma($x,$y){
    return $x+$y;
}
function sub($x,$y){
    return $x-$y;
}
function mul($x,$y){
    return $x*$y;
}
function div($x,$y){
    return $x/$y;
}

?>