/**
 * Copyright (c) 2003-2015, CKSource - Frederico Knabben. All rights reserved.
 * For licensing, see LICENSE.md or http://ckeditor.com/license
 */

/* exported initSample */

if ( CKEDITOR.env.ie && CKEDITOR.env.version < 9 )
	CKEDITOR.tools.enableHtml5Elements( document );

// The trick to keep the editor in the sample quite small
// unless user specified own height.
CKEDITOR.config.height = 350;
CKEDITOR.config.width = 'auto';

var initEditor = ( function() {
	var wysiwygareaAvailable = isWysiwygareaAvailable(),
		isBBCodeBuiltIn = !!CKEDITOR.plugins.get( 'bbcode' );

	return function() {
		var editorElement = CKEDITOR.document.getById( 'editor' );

		// :(((
		if ( isBBCodeBuiltIn ) {
			editorElement.setHtml(
				'amar :Hello world!\n\n' +
				'I\'m an instance of [url=http://ckeditor.com]CKEditor[/url].'
			);
		}

		// Depending on the wysiwygare plugin availability initialize classic or inline editor.
		if ( wysiwygareaAvailable ) {
			CKEDITOR.replace( 'editor' );
		} else {
			editorElement.setAttribute( 'contenteditable', 'true' );
			CKEDITOR.inline( 'editor' );

			// TODO we can consider displaying some info box that
			// without wysiwygarea the classic editor may not work.
		}
	};

	function isWysiwygareaAvailable() {
		// If in development mode, then the wysiwygarea must be available.
		// Split REV into two strings so builder does not replace it :D.
		if ( CKEDITOR.revision == ( '%RE' + 'V%' ) ) {
			return true;
		}

		return !!CKEDITOR.plugins.get( 'wysiwygarea' );
	}
} )();

function lookFirst()
{
    var html = CKEDITOR.instances.editor.getData();
    var f = document.getElementById('TheForm');
    f.info.value = addSuffixAndPrefix($('#title').val(), html);
    window.open('', 'TheWindow');
    f.submit();
}

function addNews()
{
    var html = CKEDITOR.instances.editor.getData();
    $('#content').val(addSuffixAndPrefix($('#title').val(),html));
    if ($('#addFrom').form('validate')) {
        document.getElementById("addFrom").submit();
    }   
}

function addSuffixAndPrefix(title,content)
{
    var htmlPrefix = "<html><head><meta charset='utf-8'><meta http-equiv='Content-Type' content ='text/html; charset=UTF-8'><title>"+title+"</title></head><body>";
    var htmlSuffix = "</body></html>";
    return htmlPrefix + content + htmlSuffix;
}