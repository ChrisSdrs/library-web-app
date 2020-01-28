jQuery(function ($){
    $('#bookVal').validate({
        rules:{
            bookPin:{
                required: true,
                digits: true
            },
            title:{
                required: true
            },
            publicationDate:{
                required: true
            },
            category:{
                required: true
            }
        },
        messages:{
            bookPin:{
                required: "Enter book's PIN",
                digits: "Book's PIN must be number, please enter only digits"
            },
            title:{
                required: "Enter title"
            },
            publicationDate:{
                required: "Enter publication date"
            },
            category:{
                required: "Enter book category"
            }
        }
    });
});