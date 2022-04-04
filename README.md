This project [takes code from Android Studio](https://android.googlesource.com/platform/tools/base/+/refs/heads/mirror-goog-studio-main/sdk-common/src/main/java/com/android/ide/common/vectordrawable) Vector Asset generator and adds support for `id` attribute from SVGs.
`id` attribute is converted to `android:name` in AVD file.

Run CMD :  `java -jar svg.jar <path-to-input-svg>  <path-output-xml-vector>`
