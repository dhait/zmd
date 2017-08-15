<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Template for Z HTML</title>
    <style>
    div.z-text {
        font-family: "Noto Sans", "Noto Sans CJK JP", sans-serif;
        padding-left: 2em;
        margin-top: 1em;
        margin-bottom: 1em;
        color: darkviolet;
    }

    div.z-axiom {
        font-family: "Noto Sans", "Noto Sans CJK JP", sans-serif;
        font-style: italic;
        margin-left: 2em;
        margin-right: 2em;
        border-left: solid black 1px;
    }

    div.z-axiom .z-axiom-decl {
        padding-left: 1em;
        padding-top: 0.5em;
        padding-bottom: 0.5em;
        color: darkviolet;
    }
    div.z-axiom .z-axiom-pred {
        border-top: solid green 1px;
        padding-left: 1em;
        padding-top: 0.5em;
        padding-bottom: 0.5em;
        width: 30em;
        color: darkviolet;
    }

    div.z-schema {
        font-family: "Noto Sans", "Noto Sans CJK JP", sans-serif;
        font-style: italic;
        margin-left: 2em;
        margin-right: 2em;
        border-left: solid black 1px;
        border-top: solid black 1px;
        border-bottom: solid black 1px;
    }
    div.z-schema .z-schema-decl {
        padding-left: 1em;
        padding-top: 0.0em;
        padding-bottom: 0.5em;
        color: darkviolet;
    }
    div.z-schema .z-schema-pred {
        border-top: solid green 1px;
        padding-left: 1em;
        padding-top: 0.5em;
        padding-bottom: 0.5em;
        width: 50%;
        color: darkviolet;
    }

    div.z-schema .z-name {
        display: inline-block;
        background:#fff;
        position: relative;
        bottom: 0.75em;
        left: 1em;
        padding-left: 0.2em;
        padding-right: 0.2em;
        color: darkviolet;
    }
    </style>
</head>
<body>
${body}
</body>
</html>