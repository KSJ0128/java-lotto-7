package lotto.controller;

import lotto.dto.Purchase;
import lotto.model.Lotto;
import lotto.model.Winning;
import lotto.service.InputService;
import lotto.service.LottoService;
import java.util.List;

public class LottoController {
    public void play() {
        InputService inputService = new InputService();
        LottoService lottoService = new LottoService();

        Purchase purchase = new Purchase(inputService.getPurchaseMoney());
        Winning winning = new Winning(inputService.getWinningNumbers(), inputService.getBonusNumber());
    }
}
