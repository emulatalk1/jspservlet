// function check() {
//     if ($('#login').click()) {
//         return true;
//         alert('this is true');
//     } else {
//         return false;
//         alert('this is false')
//     }
// }

$(document).ready(function(){
    $('#login').click(function () {
        $('#loginForm').attr('onsubmit', 'return true;');
    })
    $('#goRight').on('click', function(){
        $('#slideBox').animate({
            'marginLeft' : '0'
        });
        $('.topLayer').animate({
            'marginLeft' : '100%'
        });
    });
    $('#goLeft').on('click', function(){
        $('#slideBox').animate({
            'marginLeft' : '50%'
        });
        $('.topLayer').animate({
            'marginLeft': '0'
        });
    });
});

