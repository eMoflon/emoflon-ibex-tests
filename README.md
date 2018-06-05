# Tests for eMoflon::IBeX
A collection of JUnit tests for [eMoflon::IBeX](https://github.com/eMoflon/emoflon-ibex) 

## Testsuites
- `testsuites/TestsuiteGT`: JUnit tests for graph transformations (GT) via the Java API
	generated from the GT rule specification
- `testsuites/Testsuite`: JUnit tests for consistency checking, synchronization,
	model generation with Triple Graph Grammars (TGGs)

## How to run the tests
1. Install [eMoflon::IBeX Democles](https://github.com/eMoflon/emoflon-ibex-democles).
2. Go to ```File/Import.../Team/Team Project Set```, check URL and enter in and import this PSF file:
	https://raw.githubusercontent.com/eMoflon/emoflon-ibex-tests/master/testProjectSet.psf
3. Click on the projects `TestsuiteGT` and `Testsuite` by selecting one of the `*.launch` files.
