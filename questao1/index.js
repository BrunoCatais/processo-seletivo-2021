document.getElementById("bt").onclick = function(){

    var num1 = parseInt(document.getElementById("num1").value);
    let isPrime = true;
    
    if(num1 > 100){
        throw 'Numero invalido';
    }

    else if (num1 === 1) {
        isPrime = false;
    }

    else if (num1 > 1) {
        for (let i = 2; i < num1; i++) {
            if (num1 % i == 0) {
                isPrime = false;
                break;
            }
        }
    }

    else {
        isPrime = false;
    }

    document.getElementById("retorno").innerHTML = isPrime;
    console.log(isPrime);
    return isPrime; 
}