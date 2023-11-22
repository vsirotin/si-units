import express, { Express, Request, Response , Application } from 'express';
import dotenv from 'dotenv';
import {numberChecks, numberErrors, getNumberCheckedObjects} from './checker'
import {testTutorial} from './tests/TutorialTest'
import {testBase} from './tests/base/BaseTSTest'
import {testDerived} from './tests/derived/DerivedTSTest'
import {testSpecialUnits} from './tests/specialunits/SpecialUnitsTest'
import {testCurrencies} from './tests/currency/CurrenciesTest'


//For env File
dotenv.config();

const app: Application = express();
const port = process.env.PORT || 8000;

app.get('/', (req: Request, res: Response) => {
testTutorial()
testBase()
testDerived()
testSpecialUnits()
testCurrencies()
    let body = "<h1>Test results</h2>"
    + "<p>Number checks=" + numberChecks  + "</p>"
    + "<p>Number tested objects=" + getNumberCheckedObjects() + "</p>"
    + "<p>Number errors=" +  numberErrors + "</p>"
  res.send(body);
});

app.listen(port, () => {
  console.log(`Server is Fire at http://localhost:${port}`);
});