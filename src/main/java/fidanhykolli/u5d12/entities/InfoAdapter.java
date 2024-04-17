package fidanhykolli.u5d12.entities;

import java.util.Date;

public class InfoAdapter implements DataSource {
    private Info info;

    public InfoAdapter(Info info) {
        this.info = info;
    }

    @Override
    public String getNome() {
        return info.getNome();
    }

    @Override
    public String getCognome() {
        return info.getCognome();
    }

    @Override
    public Date getDataDiNascita() {
        return info.getDataDiNascita();
    }
}