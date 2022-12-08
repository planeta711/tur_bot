patterns:
#    $phone = $regexp<((8|[+]?7)[\- ]?)?\(?\d{3}\)?[\- ]?\d{1}[\- ]?\d{1}[\- ]?\d{1}[\- ]?\d{1}[\- ]?\d{1}(([\- ]?\d{1})?[\- ]?\d{1})>
    $phone = $regexp<((8|[+]?7)[\- ]?)?\(?\d{3}\)?[\- ]?\d{1}[\- ]?\d{1}[\- ]?\d{1}[\- ]?\d{1}[\- ]?\d{1}[\- ]?\d{1}?[\- ]?\d{1}>
    $City = $entity<cities> || converter = function(parseTree) {var id = parseTree.cities[0].value; return cities[id].value;};
    $Country = $entity<countries> || converter = function(parseTree) {var id = parseTree.countries[0].value; return countries[id].value;};
    $Name = $entity<names> || converter = function(parseTree) {var id = parseTree.names[0].value; return names[id].value;};

    $greeting = * (прив*/прев*/здравствуй*/хай*/hi/*драст*/мир * (~ты/~твой)/~добрый (~утро/~день/~ночь/~вечер/~время суток)) *
    $goodbye = * (гудбай/бай/bye/досвид*/до (свид*/завтра/встреч*)/покеда/всего * (добр*/хорош*)) *
    $weather = * ([~какой/что */узнать */расскажи *] * ~прогноз */~погода/~погодка) *
    $yes = * (~мочь/смогу/верно/да/lf/дада/ok/так точно/ага/угу*/конечно/соглас*/хорошо/давай*) *
    $dontknow = * ([еще/пока] не (выбрал*/решил*/знаю/помню/определил*)/{нет [пока/еще]}/потом [решу]) *
    $no = * (не /не могу/неверно/неправильно/нельзя/не*(верно/правильно/буду)/иначе/неа/ноу/другой/нет/ytn) *
    $refuse = * (не (назову/скажу/чего/хочу/нужен/сейчас)/ни (чего/~какой/как)/никак/никакой/уйди/отстань/отвяжись) *
    $tour = * (прими/~оформить/~оформлять/~путевка/~заявка/~заявочка/~тур/турагенство/агенство/агентство/турфирма/путешествие/подать) *
    $whatelse = * (а еще/{(что-то/что-нибудь) [умеешь/еще/другое]}) *
    $cancel = * (~выйти/выход*/стоп*/~закончить/отказ*) *