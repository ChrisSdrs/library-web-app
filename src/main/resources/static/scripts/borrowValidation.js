jQuery(function ($){
    $('#borrowVal').validate({
        rules:{
            date:{
                required: true
            },
            status:{
                required: true
            },
            bookPin:{
                required: true,
                digits: true
            },
            membNumber:{
                required: true,
                digits: true
            }
        },
        messages:{
            date:{
                required: "Enter date"
            },
            status:{
                required: "Enter status of borrow"
            },
            bookPin:{
                required: "Enter book's PIN",
                digits: "Book's PIN must be number, please enter only digits"
            },
            membNumber:{
                required: "Enter member's Membership Number",
                digits: "Membership Number must be number, please enter only digits"
            }
        }
    });
});