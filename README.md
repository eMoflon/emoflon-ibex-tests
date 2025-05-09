# Tests for eMoflon::IBeX
A collection of JUnit tests for [eMoflon::IBeX](https://github.com/eMoflon/emoflon-ibex).

## Testsuites
- `testsuites/TestsuiteGT`: JUnit tests for graph transformations (GT) via the Java API	generated from the GT rule specification.

## How to run the tests
1. Install [eMoflon::IBeX](https://github.com/eMoflon/emoflon-ibex).
1. Go to ```File/Import.../Team/Team Project Set```, check URL and enter in and import **one** of these PSF files:
	- All **GT**-related projects tests: https://raw.githubusercontent.com/eMoflon/emoflon-ibex-tests/master/testProjectSet-GT.psf
1. Click on the project `TestsuiteGT` by selecting one of the `*.launch` files. Typically, you want to run one of this file:
	- `TestsuiteGT_HiPE.launch`
