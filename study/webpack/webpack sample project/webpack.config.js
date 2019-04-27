module.exports = {
    devtool: 'source-map',
    entry: __dirname + "/app/app.js",
    output: {
        path: __dirname + "/public",
        filename: "bundle.js"
    },
    module: {
        rules:[
            {
                test: /(\.jsx|\.js)$/,
                use: {
                    loader: "babel-loader"
                },
                exclude: /node_modules/
            },
            {
                test: /\.css$/,
                use: [
                    {
                        loader: "style-loader"
                    },
                    {
                        loader: "css-loader",
                        options: {
                            modules: true,
                            localIdentName: '[path][name]__[local]--[hash:base64:5]'

                        }
                    }
                ]
            }
        ]
    }
}