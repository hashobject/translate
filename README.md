# translate

A Clojure library designed to translate text from one language to another
using various web APIs.

Initially only Google Translate v2 API is implemented.

[![Dependencies Status](https://jarkeeper.com/hashobject/translate/status.svg)](http://jarkeeper.com/hashobject/translate)
[![Downloads](https://jarkeeper.com/hashobject/translate/downloads.svg)](https://jarkeeper.com/hashobject/translate)
## Install

```
[translate "0.3.2"]
```

## Usage

```
user=> (use 'translate.google)
nil
user=> (translate "Hello" {:key "your google translate key"
                           :source "en"
                           :target "es"})
"¡Hola"
```

## Tips

If you need to get API key for Google Translate API you should visit
[Google API console](https://code.google.com/apis/console/).

## Contributions

We love contributions. Please submit your pull requests.

## License

Copyright © 2013-2015 Hashobject Ltd (team@hashobject.com).

Distributed under the [Eclipse Public License](http://opensource.org/licenses/eclipse-1.0).
