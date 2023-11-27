
export var numberChecks = 0;
export var numberErrors = 0;
const EPS = 1e-10;
const objectTypes = new Set();
export function getNumberCheckedObjects(){
    return objectTypes.size;
}

export function checkValues(a, b){
    numberChecks++;

    if (typeof a === 'string'){
        if(a == b)return;
    }else{
        if(Math.abs(a - b) < EPS)return;
    }
    numberErrors++;
    console.error("Values are different a=" + a + " b=" + b);
}

export function checkBoolean(a){
    numberChecks++;

    if(a == true)return;
    numberErrors++;
    console.error("Values is not true");
}

export function checkObjects(a, b){
    numberChecks++;

    let sa = a.unitSymbols();
    let sb = b.unitSymbols();
    objectTypes.add(sa);
    objectTypes.add(sb);

    if(sa != sb){
        numberErrors++;
        console.error("Objects have different types: '" + JSON.stringify(sa) + "' vs '" + JSON.stringify(sb) + "'");
        return;
    }
    if(Math.abs(a.value - b.value) < EPS){
        return;
    }
     numberErrors++;
     console.error("Values are different a=" + JSON.stringify(a) + " b=" + JSON.stringify(b));
}

