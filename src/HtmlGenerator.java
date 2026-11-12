public class HtmlGenerator implements HtmlProvider {

    @Override
    public String generate() {

        return """
                <!DOCTYPE html>
                <html lang="tr">
                <head>
                    <meta charset="UTF-8">
                    <meta name="viewport" content="width=device-width, initial-scale=1.0">

                    <title>Hüda Nur Sel</title>

                    <style>

                        body {
                            background: linear-gradient(135deg, #d1fae5, #bfdbfe);
                            font-family: 'Segoe UI', Arial, sans-serif;
                            text-align: center;
                            padding: 80px 20px;
                            margin: 0;
                        }

                        .container {
                            background-color: white;
                            max-width: 650px;
                            margin: auto;
                            padding: 40px;
                            border-radius: 20px;
                            box-shadow: 0 8px 25px rgba(0,0,0,0.12);
                        }

                        h1 {
                            color: #047857;
                            font-size: 38px;
                        }

                        h2 {
                            color: #2563eb;
                            font-size: 25px;
                        }

                        h3 {
                            color: #334155;
                        }

                        p {
                            color: #475569;
                            font-size: 18px;
                            line-height: 1.8;
                        }

                        .footer {
                            color: #64748b;
                            font-size: 14px;
                            margin-top: 30px;
                        }

                    </style>
                </head>

                <body>

                    <div class="container">

                        <h1>Huda Nur Sel</h1>

                        <h2>1250505012</h2>

                        <h3>Hakkimda</h3>

                        <p>
                            Merhaba! Ben Huda Nur Sel.
                            Yazilim Muhendisligi ogrencisiyim.
                            Yazilim ve teknoloji alanlarinda
                            kendimi gelistirmeyi hedefliyorum.
                        </p>

                        <div class="footer">
                            Yazilim Muhendisligi
                        </div>

                    </div>

                </body>
                </html>
                """;
    }
}