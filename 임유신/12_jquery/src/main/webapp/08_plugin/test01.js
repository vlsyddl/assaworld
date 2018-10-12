$.arr = function (obj, type) {
    
    if(type == "sum"){
        var sum = 0;
        for(var i =0; i < obj.length; i++ ){
            sum += obj[i];
        }
        return sum;
    }

    if(type == "max"){
        var max = obj[0];
        for(var i =0; i < obj.length; i++ ){
            if(max > obj[i]) continue;
            max = obj[i];
        }
        return max;
    }
    //min 구현 해야함
    return 0; 
};