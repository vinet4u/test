var main = {
   init : function () {
       var _this = this;
       $('#btn-save').on('click', function () {
           _this.save();
       })

   },

   save : function () {
       var data = {
           id : $("#id").val(),
           name : $("#name").val(),
           tel : $("#tel").val(),
           address : $("#address").val(),
           intro : $("#intro").val()
       };

       $.ajax({
           type : 'POST',
           url : '/api/v1/posts',
           dataType : 'text',
           contentType : 'application/json; charset=utf-8',
           data : JSON.stringify(data)
       }).done(function () {
           alert('글이 등록되었습니다.');
           window.location.href = '/';
       }).fail(function (error) {
           alert(JSON.stringify(error));
       })
   }

};

main.init();
