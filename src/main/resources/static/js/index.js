$(document).ready(function () {
    $('.select2').select2()

    tinymce.init({
        selector: "textarea#post",
        plugins: [
            'advlist autolink link image imagetools charmap preview',
            'searchreplace wordcount code',
            'insertdatetime contextmenu directionality',
            'codesample template table toc'
        ],
        toolbar1:  "undo redo | " +
            "styleselect |" +
            " bold italic |" +
            " alignleft aligncenter alignright alignjustify |" +
            " bullist numlist outdent indent |" +
            " link codesample",
        height: 280
    }); //end tinymce

})
