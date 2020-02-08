[![Download](https://api.bintray.com/packages/robert-cronin/fortytwoapps/tfkt/images/download.svg) ](https://bintray.com/robert-cronin/fortytwoapps/tfkt/_latestVersion)
[![Build Status](https://travis-ci.org/fortytwoapps/tfkt.svg?branch=master)](https://travis-ci.org/fortytwoapps/tfkt)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)
# TensorFlow.kt
Class based ML code in the Browser - A KotlinJS wrapper for the wonderful TensorFlow.js library.

Base library: https://www.tensorflow.org/js

## Getting Started

### Development
You can explore the TensorFlow-kt code either by browsing this repo or cloning from source:
```
git clone https://github.com/fortytwoapps/tfkt.git
```

### Installing

To setup TensorFlow-kt and start using it in your project, add these lines to build.gradle:

```
repositories {
    maven { url = "https://dl.bintray.com/robert-cronin/fortytwoapps" }
}

dependencies {
    implementation "fortytwoapps:tfkt:1.5.1"
}
```

### Usage

To start using TensorFlow-kt in your project, simply import like this:

```kotlin
import com.fortytwoapps.tfkt.*
```

## Built With

* [stitch-js-sdk](https://github.com/tensorflow/tfjs) - The underlying JavaScript library used
* [Travis CI](https://travis-ci.org/) - Continuous Integration
* [Gradle](https://gradle.org/) - Dependency Management

## Contributing

Feel free to contribute if you feel this toolkit is lacking for your application. Contributions are open.

## Authors

* **Robert Cronin** - *Initial work* - [robert-cronin](https://github.com/robert-cronin)

## License

This project is licensed under the Apache 2.0 License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* Hat tip goes to developers at Google for developing the JavaScript TensorFlow Library
* Template for this readme came from [PurpleBooth](https://github.com/PurpleBooth)
