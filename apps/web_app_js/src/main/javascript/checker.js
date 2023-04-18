
var numberChecks = 0;
const EPS = 1e-10;
function checkDouble(a, b){
    numberChecks++;
    if(Math.abs(a - b) < EPS)return
    throw "Values are different a=" + a + " b=" + b
}

