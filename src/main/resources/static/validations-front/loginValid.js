jQuery(function ($){
    $('#create-member').validate({
        rules: {
            username: {
                required: true
            },
            password: {
                required: true
            }
        },
        messages: {
            username: {
                required: 'Please enter your username'
            }
        }
    });
});