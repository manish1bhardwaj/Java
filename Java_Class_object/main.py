import requests
from bs4 import BeautifulSoup
import pandas as pd
url = "https://quotes.toscrape.com/"
response = requests.get(url)
print(response.raise_for_status())
soup = BeautifulSoup(response.text, "html.parser")
quotes = soup.find_all("div", class_="quotes")
data =[]
for quote in quotes:
  text = quote.find('span', class_='text').get_text()
  author = quote.find('small', class_='author').get_text()
  tags = [tag.get_text() for tag in quote.find_all('a',class_='tag')]
  data.append([text,author,','.join(tags)])
  df = pd.DataFrame(data,columns=['Quote','Author','Tags'])
  df
   # df.to_csv('quotes.csv')