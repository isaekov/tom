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
        height: 280,

        // image_title: true,
        // /* enable automatic uploads of images represented by blob or data URIs*/
        // automatic_uploads: true,
        // file_picker_types: 'image',
        // file_picker_callback: function (cb, value, meta) {
        //     var input = document.createElement('input');
        //     input.setAttribute('type', 'file');
        //     input.setAttribute('accept', 'image/*');
        //     input.onchange = function () {
        //         var file = this.files[0];
        //         var reader = new FileReader();
        //         reader.onload = function () {
        //             var id = 'blobid' + (new Date()).getTime();
        //             var blobCache =  tinymce.activeEditor.editorUpload.blobCache;
        //             var base64 = reader.result.split(',')[1];
        //             var blobInfo = blobCache.create(id, file, base64);
        //             blobCache.add(blobInfo);
        //
        //             /* call the callback and populate the Title field with the file name */
        //             cb(blobInfo.blobUri(), { title: file.name });
        //         };
        //         reader.readAsDataURL(file);
        //     };
        //     input.click();
        // },
        // content_style: 'body { font-family:Helvetica,Arial,sans-serif; font-size:14px }'
    }); //end tinymce

})
