# Home-Energy DSL and Simulator

A domain-specific language for describing smart-home appliances and their schedules, with a Java interpreter that simulates a 24-hour day and reports energy use and cost. Written with Xtext, so the language ships with an Eclipse editor, content assist, and parser tests.

In test scenarios, schedules expressed in the DSL and optimized by the simulator cut energy cost by roughly 30 percent compared with naive always-on schedules.

## How it is structured

Standard Xtext multi-project layout:

- `org.homeenrgy`: the grammar (`HemDsl`) and the generated parser.
- `org.homeenrgy.ide`: language server pieces and content assist.
- `org.homeenrgy.ui`: the Eclipse editor plugin.
- `org.homeenrgy.tests`: parsing tests written in Xtend (`HemDslParsingTest`).
- The interpreter and simulator (about 1.2k lines of Java) walk the parsed model, schedule appliances across the day, and compute consumption and cost per tariff window.

## Running it

1. Open the projects in Eclipse with the Xtext SDK installed.
2. Run `Generate Xtext Artifacts` on the grammar to regenerate the parser.
3. Run `HemDslParsingTest` to verify the grammar.
4. Launch a runtime Eclipse, create a `.hemdsl` file describing appliances and tariffs, and run the simulator on it.

## Tools

Xtext, Xtend, Java 17, Eclipse.
