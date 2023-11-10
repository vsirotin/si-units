import express, { Express, Request, Response , Application } from 'express';
import dotenv from 'dotenv';
import {eu} from 'kotunil-js-lib';

//For env File
dotenv.config();

const app: Application = express();
const port = process.env.PORT || 8000;

app.get('/', (req: Request, res: Response) => {
  res.send('m=' + eu.sirotin.kotunil.base.m);
});

app.listen(port, () => {
  console.log(`Server is Fire at http://localhost:${port}`);
});