// 플러그인 등록
// jQuery  객체의 prototype 영역에 추가
(function ($) {
    function  changeComma(val){
        // g = 123,123,123,123 comma를 다 찾는다.
        val.replace(/,/g, "");
        //3자리마다 콤마 추가
       return val.toString().replace(/\B(?=(\d{3})+(?!\d))/g, ",");


    }

    $.fn.comma = function () {
        var ele = this;
        this.keyup(function () {
            ele.val(changeComma(ele.val()));
        });
    };

})(jQuery);