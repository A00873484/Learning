function mapForEach(arr, fn){
    var newArr = [];
    for(var i=0; i<arr.length; i++){
        newArr.push(
            fn(arr[i])
        );
    }
    return newArr;
}

var arr2 = mapForEach(arr1, function(item){
    return item * 2;
});