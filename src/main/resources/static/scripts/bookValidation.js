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
                required: "Enter book's PIN"
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
    $( document ).ready(function() {
            RemoveCommaFromCost();
        });

        $('#year').change(function(){
            RemoveCommaFromCost();
        });

        function RemoveCommaFromCost(){
            var costValue = $('#year').val();
            costValue = costValue.replace(",","");
            $('#year').val(costValue);
        };
});