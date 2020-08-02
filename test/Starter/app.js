/*var arr = [
    20.13, 48.8, 66.82, 69, 74.12, 81.44, 86.92, 90.6, 100.22, 140, 151, 154.61, 
    171, 201, 208.68, 223, 285.7, 316.96, 348.2, 371.62, 428.54
]
var comp = 1392.84;

combo(arr, []);
var results = [];
function combo(remaining, res){
    var totals = [];
    var total = 0;
    for(var j=0; j<res.length; j++){
        total += res[j];
    }
    if(total===comp){
        console.log(remaining);
        console.log(res);
    } else if(total > comp){

    } else {
        for(var i=0; i<remaining.length; i++){
            var newremaining = remaining.slice();
            var newres = res.slice();
            var out=newremaining.splice(i, 1);
            newres.push(out[0]);
            combo(newremaining.slice(), newres.slice());   
        }
    }
}*/


//[ 86.92, 90.6, 171, 208.68, 223, 316.96, 348.2, 371.62, 428.54 ]
var arr = 
[ 20.13,
  48.8,
  66.82,
  69,
  74.12,
  81.44,
  285.7,
  154.61,
  201,
  100.22,
  151,
  140 ];
var total = 0;
for(var i=0; i<arr.length; i++){
    total += arr[i];
}
console.log(total);