var numberChecks = 0;
const EPS = 1e-10;
const objectTypes = new Set();
function checkValues(a, b){
    numberChecks++;
    if(Math.abs(a - b) < EPS)return
    throw "Values are different a=" + a + " b=" + b
}

function checkObjects(a, b){
    numberChecks++;
    let sa = a.unitSymbols();
    let sb = b.unitSymbols();
    objectTypes.add(sa);
    objectTypes.add(sb);
    if(sa != sb){
        throw "Objects have different types: '" + sa + "' vs '" + sb + "'";
    }
    if(Math.abs(a.value - b.value) < EPS){
        return;
    }
    throw "Values are different a=" + a + " b=" + b;
}

