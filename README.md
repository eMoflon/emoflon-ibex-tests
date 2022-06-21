# Tests for eMoflon::IBeX
A collection of JUnit tests for [eMoflon::IBeX](https://github.com/eMoflon/emoflon-ibex).

## Testsuites
- `testsuites/TestsuiteGT`: JUnit tests for graph transformations (GT) via the Java API	generated from the GT rule specification.
- `testsuites/Testsuite`: JUnit tests for consistency checking, synchronization, and model generation with Triple Graph Grammars (TGGs).

## How to run the tests
1. Install [eMoflon::IBeX](https://github.com/eMoflon/emoflon-ibex).
1. Go to ```File/Import.../Team/Team Project Set```, check URL and enter in and import **one** of these PSF files:
	- All **GT**-related projects tests: https://raw.githubusercontent.com/eMoflon/emoflon-ibex-tests/master/testProjectSet-GT.psf
	- All **TGG**-related projects and tests: https://raw.githubusercontent.com/eMoflon/emoflon-ibex-tests/master/testProjectSet-TGG.psf
	- All projects and tests: https://raw.githubusercontent.com/eMoflon/emoflon-ibex-tests/master/testProjectSet.psf
1. Click on the projects `TestsuiteGT` and `Testsuite` by selecting one of the `*.launch` files. Typically, you want to run one of these files:
	- `TestsuiteGT_HiPE.launch`
	- `Testsuite_HiPE_SAT4J.launch`
