public class AlternativeHtmlGenerator implements HtmlProvider {

    @Override
    public String generate() {

        return """
                <!DOCTYPE html>
                <html lang="tr">
                <head>
                    <meta charset="UTF-8">
                    <title>Hüda Nur Sel</title>

                    <style>
                        body {
                            background-color: #fef3c7;
                            font-family: Arial, sans-serif;
                            text-align: center;
                            padding: 80px;
                        }

                        h1 {
                            color: #b45309;
                        }

                        h2 {
                            color: #7c3aed;
                        }

                        p {
                            color: #475569;
                            font-size: 18px;
                        }
                    </style>
                </head>

                <body>
                    <h1>Huda Nur Sel</h1>
                    <h2>1250505012</h2>
                    <p>Yazilim Muhendisligi ogrencisiyim.</p>
                </body>
                </html>
                """;
    }
}