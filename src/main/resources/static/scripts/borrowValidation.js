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
                required: true
            },
            membNumber:{
                required: true
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
                required: "Enter book's PIN"
            },
            membNumber:{
                required: "Enter member's Membership Number"
            }
        }
    });
    // $( document ).ready(function() {
    //     RemoveCommaFromCost();
    // });
    //
    // $('#cost').change(function(){
    //     RemoveCommaFromCost();
    // });
    //
    // function RemoveCommaFromCost(){
    //     var costValue = $('#cost').val();
    //     costValue = costValue.replace(",","");
    //     $('#cost').val(costValue);
    // };
});