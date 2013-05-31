# translate

A Clojure library designed to translate text from one language to another
using various web APIs.

Initially Google Translate v2 API is implemented.

## Install

```
[translate "0.1.0"]
```

## Usage

```
user=> (:use 'translate.google)
nil
user=> (translate "Hello" {:key "your google translate key"
                           :source "en"
                           :target "es"})
"¡Hola"
```

## Tips

If you need to get API key for Google Translate API you should visit
[Google API console](https://code.google.com/apis/console/).

## License

Copyright © 2013 HashObject Ltd (team@hashobject.com).

Distributed under the Eclipse Public License, the same as Clojure.
