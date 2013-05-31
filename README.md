# translate

A Clojure library designed to translate text from one language to another
using various web APIs.

Initially Google Translate v2 API is implemented.

## Install

```
[translate "0.3.0"]
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

The use and distribution terms for this software are covered by the Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0) which can be found in the file epl-v10.html at the root of this distribution.

By using this software in any fashion, you are agreeing to be bound by the terms of this license.

You must not remove this notice, or any other, from this software.
